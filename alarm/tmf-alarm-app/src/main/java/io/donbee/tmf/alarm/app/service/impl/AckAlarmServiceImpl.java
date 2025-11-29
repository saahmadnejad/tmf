package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.AckAlarmService;
import io.donbee.tmf.alarm.common.model.AckAlarm;
import io.donbee.tmf.alarm.common.model.AckAlarmFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Default stub implementation of {@link AckAlarmService}.
 * All methods are not implemented yet and throw {@link UnsupportedOperationException}.
 */
@Service
public class AckAlarmServiceImpl implements AckAlarmService {

    @Override
    public ResponseEntity<AckAlarm> createAckAlarm(AckAlarmFVO ackAlarmFVO, String fields) {
        throw new UnsupportedOperationException("createAckAlarm is not implemented yet");
    }

    @Override
    public ResponseEntity<List<AckAlarm>> listAckAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("listAckAlarm is not implemented yet");
    }

    @Override
    public ResponseEntity<AckAlarm> retrieveAckAlarm(String id, String fields) {
        throw new UnsupportedOperationException(
                String.format("retrieveAckAlarm with id=%s is not implemented yet", id));
    }
}
