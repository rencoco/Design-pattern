package com.ryx.designpattern.controller;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class NoticeMessage {



    /**
     * uuid --业务方生成
     */
    private String uuid;
    /**
     * 服务service  可能调用业务方会被重写
     */
    private String service_code;

    public NoticeMessage(String uuid, String service_code) {
        this.uuid = uuid;
        this.service_code = service_code;
    }

    public NoticeMessage() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getService_code() {
        return service_code;
    }

    public void setService_code(String service_code) {
        this.service_code = service_code;
    }


    @Override
    public String toString() {
        return "NoticeInput{" +
                "uuid='" + uuid + '\'' +
                ", service_code='" + service_code + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        NoticeMessage that = (NoticeMessage) o;

        return new EqualsBuilder()
                .append(uuid, that.uuid)
                .append(service_code, that.service_code)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(uuid)
                .append(service_code)
                .toHashCode();
    }
}
