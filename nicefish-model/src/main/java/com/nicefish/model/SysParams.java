package com.nicefish.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SysParams {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_params.PARAM_KEY
     *
     * @mbggenerated
     */
    private String paramKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_params.PARAM_VALUE
     *
     * @mbggenerated
     */
    private String paramValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_params.PARAM_DESC
     *
     * @mbggenerated
     */
    private String paramDesc;
}