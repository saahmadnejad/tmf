package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.ClearAlarmApi;
import io.donbee.tmf.alarm.starter.service.ClearAlarmService;
import io.donbee.tmf.alarm.common.model.ClearAlarm;
import io.donbee.tmf.alarm.common.model.ClearAlarmFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClearAlarmController implements ClearAlarmApi {

    private final ClearAlarmService service;

    @Override
    public ResponseEntity<ClearAlarm> createClearAlarm(ClearAlarmFVO clearAlarmFVO, String fields) {
        return service.createClearAlarm(clearAlarmFVO, fields);
    }

    @Override
    public ResponseEntity<List<ClearAlarm>> listClearAlarm(String fields, Integer offset, Integer limit) {
        return service.listClearAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<ClearAlarm> retrieveClearAlarm(String id, String fields) {
        return service.retrieveClearAlarm(id, fields);
    }
}
