package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.UnGroupAlarmApi;
import io.donbee.tmf.alarm.starter.service.UnGroupAlarmService;
import io.donbee.tmf.alarm.common.model.UnGroupAlarm;
import io.donbee.tmf.alarm.common.model.UnGroupAlarmFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UnGroupAlarmController implements UnGroupAlarmApi {

    private final UnGroupAlarmService service;

    @Override
    public ResponseEntity<UnGroupAlarm> createUnGroupAlarm(UnGroupAlarmFVO unGroupAlarmFVO, String fields) {
        return service.createUnGroupAlarm(unGroupAlarmFVO, fields);
    }

    @Override
    public ResponseEntity<List<UnGroupAlarm>> listUnGroupAlarm(String fields, Integer offset, Integer limit) {
        return service.listUnGroupAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<UnGroupAlarm> retrieveUnGroupAlarm(String id, String fields) {
        return service.retrieveUnGroupAlarm(id, fields);
    }
}
