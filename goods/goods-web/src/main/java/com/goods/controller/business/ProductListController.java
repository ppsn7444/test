package com.goods.controller.business;

import com.goods.business.service.ProductListService;
import com.goods.common.model.business.Product;
import com.goods.common.response.ResponseBean;
import com.goods.common.vo.business.ProductListSelectVo;
import com.goods.common.vo.business.ProductVO;
import com.goods.common.vo.system.PageVO;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business/product/")
public class ProductListController {
//    http://www.localhost:8989/business/product/findProductList?pageNum=1&pageSize=6&name=&categoryId=&supplier=&status=0
//    get("business/product/findProductList", { params: this.queryMap }
//     pageNum,PageSize,name,categoryId,supplier,status
//      返回 this.total = res.data.total;
//      this.productData = res.data.rows;

    @Autowired
    private ProductListService productListService;
    @ApiOperation("物资资料列表一栏")
    @GetMapping("findProductList")
    public ResponseBean findProductList (ProductListSelectVo productListSelectVo){
        PageVO<ProductVO> productVos = productListService.findProductList(productListSelectVo);
        return ResponseBean.success(productVos);
    }
}
