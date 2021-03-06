package jp.ac.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.ac.ems.bean.QuestionBean;

/**
 * 問題用リポジトリ(question repository).
 * @author tejc999999
 */
public interface QuestionRepository extends
                                    JpaRepository<QuestionBean, Long> {
    
    /**
     * タイトルと説明文に検索文字列が含まれることを条件とした取得.
     * 
     * @param searchTitleStr タイトル対象検索文字列
     * @param searchDescriptionStr 説明文対象検索文字列
     * @return 問題Beanリスト
     */
    List<QuestionBean> findByTitleLikeOrDescriptionLike(
            String searchTitleStr, String searchDescriptionStr);   
}
