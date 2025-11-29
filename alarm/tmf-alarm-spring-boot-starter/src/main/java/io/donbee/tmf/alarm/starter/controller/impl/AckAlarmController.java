package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.AckAlarmApi;
import io.donbee.tmf.alarm.starter.service.AckAlarmService;
import io.donbee.tmf.alarm.common.model.AckAlarm;
import io.donbee.tmf.alarm.common.model.AckAlarmFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AckAlarmController implements AckAlarmApi {

    private final AckAlarmService service;

    @Override
    public ResponseEntity<AckAlarm> createAckAlarm(AckAlarmFVO ackAlarmFVO, String fields) {
        return service.createAckAlarm(ackAlarmFVO, fields);
    }

    @Override
    public ResponseEntity<List<AckAlarm>> listAckAlarm(String fields, Integer offset, Integer limit) {
        return service.listAckAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<AckAlarm> retrieveAckAlarm(String id, String fields) {
        return service.retrieveAckAlarm(id, fields);
    }
}
