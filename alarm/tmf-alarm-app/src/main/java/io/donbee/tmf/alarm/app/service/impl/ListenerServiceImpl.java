package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.ListenerService;
import io.donbee.tmf.alarm.common.model.AckAlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.AckAlarmStateChangeEvent;
import io.donbee.tmf.alarm.common.model.AlarmAttributeValueChangeEvent;
import io.donbee.tmf.alarm.common.model.AlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.AlarmDeleteEvent;
import io.donbee.tmf.alarm.common.model.AlarmStateChangeEvent;
import io.donbee.tmf.alarm.common.model.ClearAlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.ClearAlarmStateChangeEvent;
import io.donbee.tmf.alarm.common.model.CommentAlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.CommentAlarmStateChangeEvent;
import io.donbee.tmf.alarm.common.model.GroupAlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.GroupAlarmStateChangeEvent;
import io.donbee.tmf.alarm.common.model.UnAckAlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.UnAckAlarmStateChangeEvent;
import io.donbee.tmf.alarm.common.model.UnGroupAlarmCreateEvent;
import io.donbee.tmf.alarm.common.model.UnGroupAlarmStateChangeEvent;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ListenerServiceImpl implements ListenerService {

    @Override
    public ResponseEntity<Void> ackAlarmCreateEvent(AckAlarmCreateEvent ackAlarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> ackAlarmStateChangeEvent(AckAlarmStateChangeEvent ackAlarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> alarmAttributeValueChangeEvent(AlarmAttributeValueChangeEvent alarmAttributeValueChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> alarmCreateEvent(AlarmCreateEvent alarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> alarmDeleteEvent(AlarmDeleteEvent alarmDeleteEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> alarmStateChangeEvent(AlarmStateChangeEvent alarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> clearAlarmCreateEvent(ClearAlarmCreateEvent clearAlarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> clearAlarmStateChangeEvent(ClearAlarmStateChangeEvent clearAlarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> commentAlarmCreateEvent(CommentAlarmCreateEvent commentAlarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> commentAlarmStateChangeEvent(CommentAlarmStateChangeEvent commentAlarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> groupAlarmCreateEvent(GroupAlarmCreateEvent groupAlarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> groupAlarmStateChangeEvent(GroupAlarmStateChangeEvent groupAlarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> unAckAlarmCreateEvent(UnAckAlarmCreateEvent unAckAlarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> unAckAlarmStateChangeEvent(UnAckAlarmStateChangeEvent unAckAlarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> unGroupAlarmCreateEvent(UnGroupAlarmCreateEvent unGroupAlarmCreateEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> unGroupAlarmStateChangeEvent(UnGroupAlarmStateChangeEvent unGroupAlarmStateChangeEvent) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
