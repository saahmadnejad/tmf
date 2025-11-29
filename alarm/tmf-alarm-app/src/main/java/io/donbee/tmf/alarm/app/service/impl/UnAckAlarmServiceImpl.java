package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.UnAckAlarmService;
import io.donbee.tmf.alarm.common.model.UnAckAlarm;
import io.donbee.tmf.alarm.common.model.UnAckAlarmFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnAckAlarmServiceImpl implements UnAckAlarmService {

    @Override
    public ResponseEntity<UnAckAlarm> createUnAckAlarm(UnAckAlarmFVO unAckAlarmFVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<List<UnAckAlarm>> listUnAckAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<UnAckAlarm> retrieveUnAckAlarm(String id, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
