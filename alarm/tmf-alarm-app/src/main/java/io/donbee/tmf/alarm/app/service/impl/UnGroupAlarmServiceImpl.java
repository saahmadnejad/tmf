package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.UnGroupAlarmService;
import io.donbee.tmf.alarm.common.model.UnGroupAlarm;
import io.donbee.tmf.alarm.common.model.UnGroupAlarmFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnGroupAlarmServiceImpl implements UnGroupAlarmService {

    @Override
    public ResponseEntity<UnGroupAlarm> createUnGroupAlarm(UnGroupAlarmFVO unGroupAlarmFVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<List<UnGroupAlarm>> listUnGroupAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<UnGroupAlarm> retrieveUnGroupAlarm(String id, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
