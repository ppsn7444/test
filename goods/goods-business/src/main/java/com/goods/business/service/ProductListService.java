package com.goods.business.service;

import com.goods.common.vo.business.ProductListSelectVo;
import com.goods.common.vo.business.ProductVO;
import com.goods.common.vo.system.PageVO;

public interface ProductListService {
    PageVO<ProductVO> findProductList(ProductListSelectVo productListSelectVo);
}
