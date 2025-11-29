package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.GroupAlarmService;
import io.donbee.tmf.alarm.common.model.GroupAlarm;
import io.donbee.tmf.alarm.common.model.GroupAlarmFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupAlarmServiceImpl implements GroupAlarmService {

    @Override
    public ResponseEntity<GroupAlarm> createGroupAlarm(GroupAlarmFVO groupAlarmFVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<List<GroupAlarm>> listGroupAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<GroupAlarm> retrieveGroupAlarm(String id, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
