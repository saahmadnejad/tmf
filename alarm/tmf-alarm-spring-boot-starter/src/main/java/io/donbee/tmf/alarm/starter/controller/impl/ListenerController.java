package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.ListenerApi;
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
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ListenerController implements ListenerApi {

    private final ListenerService service;

    @Override
    public ResponseEntity<Void> ackAlarmCreateEvent(AckAlarmCreateEvent ackAlarmCreateEvent) {
        return service.ackAlarmCreateEvent(ackAlarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> ackAlarmStateChangeEvent(AckAlarmStateChangeEvent ackAlarmStateChangeEvent) {
        return service.ackAlarmStateChangeEvent(ackAlarmStateChangeEvent);
    }

    @Override
    public ResponseEntity<Void> alarmAttributeValueChangeEvent(AlarmAttributeValueChangeEvent alarmAttributeValueChangeEvent) {
        return service.alarmAttributeValueChangeEvent(alarmAttributeValueChangeEvent);
    }

    @Override
    public ResponseEntity<Void> alarmCreateEvent(AlarmCreateEvent alarmCreateEvent) {
        return service.alarmCreateEvent(alarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> alarmDeleteEvent(AlarmDeleteEvent alarmDeleteEvent) {
        return service.alarmDeleteEvent(alarmDeleteEvent);
    }

    @Override
    public ResponseEntity<Void> alarmStateChangeEvent(AlarmStateChangeEvent alarmStateChangeEvent) {
        return service.alarmStateChangeEvent(alarmStateChangeEvent);
    }

    @Override
    public ResponseEntity<Void> clearAlarmCreateEvent(ClearAlarmCreateEvent clearAlarmCreateEvent) {
        return service.clearAlarmCreateEvent(clearAlarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> clearAlarmStateChangeEvent(ClearAlarmStateChangeEvent clearAlarmStateChangeEvent) {
        return service.clearAlarmStateChangeEvent(clearAlarmStateChangeEvent);
    }

    @Override
    public ResponseEntity<Void> commentAlarmCreateEvent(CommentAlarmCreateEvent commentAlarmCreateEvent) {
        return service.commentAlarmCreateEvent(commentAlarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> commentAlarmStateChangeEvent(CommentAlarmStateChangeEvent commentAlarmStateChangeEvent) {
        return service.commentAlarmStateChangeEvent(commentAlarmStateChangeEvent);
    }

    @Override
    public ResponseEntity<Void> groupAlarmCreateEvent(GroupAlarmCreateEvent groupAlarmCreateEvent) {
        return service.groupAlarmCreateEvent(groupAlarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> groupAlarmStateChangeEvent(GroupAlarmStateChangeEvent groupAlarmStateChangeEvent) {
        return service.groupAlarmStateChangeEvent(groupAlarmStateChangeEvent);
    }

    @Override
    public ResponseEntity<Void> unAckAlarmCreateEvent(UnAckAlarmCreateEvent unAckAlarmCreateEvent) {
        return service.unAckAlarmCreateEvent(unAckAlarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> unAckAlarmStateChangeEvent(UnAckAlarmStateChangeEvent unAckAlarmStateChangeEvent) {
        return service.unAckAlarmStateChangeEvent(unAckAlarmStateChangeEvent);
    }

    @Override
    public ResponseEntity<Void> unGroupAlarmCreateEvent(UnGroupAlarmCreateEvent unGroupAlarmCreateEvent) {
        return service.unGroupAlarmCreateEvent(unGroupAlarmCreateEvent);
    }

    @Override
    public ResponseEntity<Void> unGroupAlarmStateChangeEvent(UnGroupAlarmStateChangeEvent unGroupAlarmStateChangeEvent) {
        return service.unGroupAlarmStateChangeEvent(unGroupAlarmStateChangeEvent);
    }
}
