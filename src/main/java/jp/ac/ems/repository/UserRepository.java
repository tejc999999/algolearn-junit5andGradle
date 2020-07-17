package jp.ac.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.ac.ems.bean.UserBean;

/**
 * ユーザー用リポジトリ(user repository).
 * @author tejc999999
 */
public interface UserRepository extends JpaRepository<UserBean, String> {

    /**
     * 権限IDを条件とした取得.
     * 
     * @param roleId 権限ID
     * @return ユーザーBean
     */
    List<UserBean> findByRoleId(String roleId);   
}