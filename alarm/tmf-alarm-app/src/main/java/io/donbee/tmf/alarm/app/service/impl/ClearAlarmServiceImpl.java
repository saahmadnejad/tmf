package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.ClearAlarmService;
import io.donbee.tmf.alarm.common.model.ClearAlarm;
import io.donbee.tmf.alarm.common.model.ClearAlarmFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClearAlarmServiceImpl implements ClearAlarmService {

    @Override
    public ResponseEntity<ClearAlarm> createClearAlarm(ClearAlarmFVO clearAlarmFVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<List<ClearAlarm>> listClearAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<ClearAlarm> retrieveClearAlarm(String id, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
