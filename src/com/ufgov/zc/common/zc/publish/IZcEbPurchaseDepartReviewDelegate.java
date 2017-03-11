package com.ufgov.zc.common.zc.publish;import java.util.List;import com.ufgov.zc.common.system.Publishable;import com.ufgov.zc.common.system.RequestMeta;import com.ufgov.zc.common.system.dto.ElementConditionDto;import com.ufgov.zc.common.zc.model.ZcEbPurchaseDepartReview;public interface IZcEbPurchaseDepartReviewDelegate extends Publishable {  public List getZcEbPurchaseDepartReviewByCondition(ElementConditionDto condition, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview getZcEbPurchaseDepartReviewById(String reviewId, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview insertZcEbPurchaseDepartReview(ZcEbPurchaseDepartReview po, RequestMeta requestMeta);  public void updateZcEbPurchaseDepartReview(ZcEbPurchaseDepartReview po, RequestMeta requestMeta);  public void deleteZcEbPurchaseDepartReviewById(String reviewId, RequestMeta requestMeta);  public void deleteZcEbPurchaseDepartReviewByIds(String[] reviewIds, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview newCommitFN(ZcEbPurchaseDepartReview currentObject, boolean isFromList, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview auditFN(ZcEbPurchaseDepartReview currentObject, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview callbackFN(ZcEbPurchaseDepartReview currentObject, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview unAuditFN(ZcEbPurchaseDepartReview currentObject, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview untreadFN(ZcEbPurchaseDepartReview currentObject, RequestMeta requestMeta);  public ZcEbPurchaseDepartReview CancelMake(ZcEbPurchaseDepartReview currentObject, RequestMeta meta);  public void deleteZcEbPurchaseDepartReviewByCode(String reviewId, RequestMeta requestMeta);}