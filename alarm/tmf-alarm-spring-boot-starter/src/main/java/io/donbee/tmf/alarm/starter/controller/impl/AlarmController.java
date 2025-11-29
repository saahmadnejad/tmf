package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.AlarmApi;
import io.donbee.tmf.alarm.starter.service.AlarmService;
import io.donbee.tmf.alarm.common.model.Alarm;
import io.donbee.tmf.alarm.common.model.AlarmFVO;
import io.donbee.tmf.alarm.common.model.AlarmMVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AlarmController implements AlarmApi {

    private final AlarmService service;

    @Override
    public ResponseEntity<Alarm> createAlarm(AlarmFVO alarmFVO, String fields) {
        return service.createAlarm(alarmFVO, fields);
    }

    @Override
    public ResponseEntity<Void> deleteAlarm(String id) {
        return service.deleteAlarm(id);
    }

    @Override
    public ResponseEntity<List<Alarm>> listAlarm(String fields, Integer offset, Integer limit) {
        return service.listAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<Alarm> patchAlarm(String id, AlarmMVO alarmMVO, String fields) {
        return service.patchAlarm(id, alarmMVO, fields);
    }

    @Override
    public ResponseEntity<Alarm> retrieveAlarm(String id, String fields) {
        return service.retrieveAlarm(id, fields);
    }
}
