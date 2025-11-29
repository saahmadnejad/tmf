package io.donbee.tmf.alarm.starter.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@AutoConfiguration
@ComponentScan(basePackages = "io.donbee.tmf.alarm.starter.controller")
public class TmfAlarmAutoConfiguration {
}