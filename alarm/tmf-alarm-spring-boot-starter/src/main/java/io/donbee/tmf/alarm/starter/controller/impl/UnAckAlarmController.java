package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.UnAckAlarmApi;
import io.donbee.tmf.alarm.starter.service.UnAckAlarmService;
import io.donbee.tmf.alarm.common.model.UnAckAlarm;
import io.donbee.tmf.alarm.common.model.UnAckAlarmFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UnAckAlarmController implements UnAckAlarmApi {

    private final UnAckAlarmService service;

    @Override
    public ResponseEntity<UnAckAlarm> createUnAckAlarm(UnAckAlarmFVO unAckAlarmFVO, String fields) {
        return service.createUnAckAlarm(unAckAlarmFVO, fields);
    }

    @Override
    public ResponseEntity<List<UnAckAlarm>> listUnAckAlarm(String fields, Integer offset, Integer limit) {
        return service.listUnAckAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<UnAckAlarm> retrieveUnAckAlarm(String id, String fields) {
        return service.retrieveUnAckAlarm(id, fields);
    }
}
