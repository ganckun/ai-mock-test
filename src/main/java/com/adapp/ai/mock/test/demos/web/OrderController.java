package com.adapp.ai.mock.test.demos.web;

import com.adapp.ai.mock.test.demos.common.PageDTO;
import com.adapp.ai.mock.test.demos.common.PageResult;
import com.adapp.ai.mock.test.demos.common.Result;
import com.dbapp.ai.mock.annotation.AIMock;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @AIMock("订单添加")
    @PostMapping("/add")
    public Result<Order> add(@RequestBody Order order) {
        return null;
    }

    @AIMock
    @PostMapping("/addBatch")
    public Result<List<Order>> addBatch(@RequestBody List<Order> orders) {
        return null;
    }

    @AIMock
    @GetMapping("/detail")
    public Result<Order> detail(@RequestParam("id") Long id) {
        return null;
    }

    @AIMock
    @GetMapping("/page")
    public PageResult<Order> page(@RequestBody PageDTO pageDTO) {
        return null;
    }

    @AIMock
    @GetMapping("/list")
    public Result<List<Order>> list() {
        return null;
    }

    @Data
    public static class Order {
        @AIMock("订单编号")
        private String orderNo;
        @AIMock("订单金额")
        private BigDecimal amount;
        @AIMock("订单状态")
        private String status;
        @AIMock("订单详情")
        private List<OrderDetail> details;

        @Data
        public static class OrderDetail {
            @AIMock("订单编号")
            private String orderNo;
            @AIMock("商品编号")
            private String productNo;
            @AIMock("商品名称")
            private String productName;
            @AIMock("商品数量")
            private Integer quantity;
            @AIMock("商品价格")
            private BigDecimal price;
        }
    }
}