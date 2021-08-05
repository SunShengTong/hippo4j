package com.github.dynamic.threadpool.starter.remote;

import com.github.dynamic.threadpool.common.web.base.Result;

import java.util.Map;

/**
 * Http Agent.
 *
 * @author chen.ma
 * @date 2021/6/23 20:45
 */
public interface HttpAgent {

    /**
     * 开始获取服务集合
     */
    void start();

    /**
     * 获取命名空间
     *
     * @return
     */
    String getTenantId();

    /**
     * 获取编码集
     *
     * @return
     */
    String getEncode();

    /**
     * 发起 Http Get 请求
     *
     * @param path
     * @param headers
     * @param paramValues
     * @param readTimeoutMs
     * @return
     */
    Result httpGet(String path, Map<String, String> headers, Map<String, String> paramValues,
                   long readTimeoutMs);

    /**
     * 发起 Http Post 请求
     *
     * @param path
     * @param headers
     * @param paramValues
     * @param readTimeoutMs
     * @return
     */
    Result httpPost(String path, Map<String, String> headers, Map<String, String> paramValues,
                    long readTimeoutMs);

    /**
     * 发起 Http Delete 请求
     *
     * @param path
     * @param headers
     * @param paramValues
     * @param readTimeoutMs
     * @return
     */
    Result httpDelete(String path, Map<String, String> headers, Map<String, String> paramValues,
                      long readTimeoutMs);
}