package com.test.springcloud.entities;

import javafx.application.Application;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private int code;
    private String msg;
    private T data;

    public CommonResult(int code, String msg) {
      this.code = code;
      this.msg = msg;
 }

}
