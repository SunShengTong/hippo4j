package com.github.dynamic.threadpool.config.service;

import com.github.dynamic.threadpool.config.event.LocalDataChangeEvent;
import com.github.dynamic.threadpool.config.notify.NotifyCenter;

/**
 * Config Change Publisher.
 *
 * @author chen.ma
 * @date 2021/6/24 23:34
 */
public class ConfigChangePublisher {

    /**
     * Notify ConfigChange.
     *
     * @param event
     */
    public static void notifyConfigChange(LocalDataChangeEvent event) {
        NotifyCenter.publishEvent(event);
    }

}