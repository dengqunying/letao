package com.dqy.util;

public enum DataRespon {
    SUSSESS(200,"操作成功"),ERROR(300,"未登录"),FIN(1000,"稍等片刻"),INFO(100,"商品已经抢光了"),BAD_REQUEST(400,"参数异常"),INTERNAL_SERVOR_ERROR(500,"服务器内部错误");

    private Integer index;
    private String name;

    DataRespon(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }


    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
