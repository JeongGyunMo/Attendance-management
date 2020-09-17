package jp.ac.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
 
public class JoinValidator implements Validator{
    
    private static final String emailRegExp =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private Pattern pattern;
 
    public JoinValidator() {
        pattern = Pattern.compile(emailRegExp);
    }
 
    @Override
    public boolean supports(Class<?> clazz) {
        return JoinRequest.class.isAssignableFrom(clazz);
    }
 
    @Override
    public void validate(Object target, Errors errors) {
    	JoinRequest regReq = (JoinRequest) target;
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required", "필수 정보 입니다.");
        ValidationUtils.rejectIfEmpty(errors, "password", "required", "필수 정보 입니다.");
        ValidationUtils.rejectIfEmpty(errors, "checkPw", "required", "필수 정보 입니다.");
        if(!regReq.getPassword().isEmpty()) {
            if(!regReq.isPwEqualToCheckPw()) {
                errors.rejectValue("checkPw", "nomatch", "비밀번호가 일치하지 않습니다.");
            }
        }
    }
 
}