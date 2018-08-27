package cn.skill6.service.intf.basic;

import java.util.Date;
import java.util.List;

import cn.skill6.common.entity.po.ArticleModifyRecord;

/**
 * 文章历史版本操作接口
 *
 * @author 何明胜
 * @version 1.0.0
 * @since 2018年8月28日 上午1:28:25
 */
public interface ArticleModifyRecordOper {
  int deleteByPrimaryKey(Long articleId, Date lastModifyDate);

  Long addArticleInfo(ArticleModifyRecord articleModifyRecord);

  ArticleModifyRecord findByArticleId(Long articleId);

  List<ArticleModifyRecord> findAll();

  void modifyByArticleId(ArticleModifyRecord articleModifyRecord);
}
