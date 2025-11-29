package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.AlarmService;
import io.donbee.tmf.alarm.common.model.Alarm;
import io.donbee.tmf.alarm.common.model.AlarmFVO;
import io.donbee.tmf.alarm.common.model.AlarmMVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmServiceImpl implements AlarmService {

    @Override
    public ResponseEntity<Alarm> createAlarm(AlarmFVO alarmFVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> deleteAlarm(String id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<List<Alarm>> listAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Alarm> patchAlarm(String id, AlarmMVO alarmMVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Alarm> retrieveAlarm(String id, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
