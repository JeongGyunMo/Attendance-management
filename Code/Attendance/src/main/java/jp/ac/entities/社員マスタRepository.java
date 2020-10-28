package jp.ac.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import jp.ac.entities.社員マスタ;

public interface 社員マスタRepository extends JpaRepository<社員マスタ, Long> {
	public 社員マスタ findByEmployname(String employname);
	public 社員マスタ findByLoginidAndLoginpass(String loginid, String loginpass);
}