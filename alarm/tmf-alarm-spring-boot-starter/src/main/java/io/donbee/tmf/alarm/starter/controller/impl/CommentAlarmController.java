package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.CommentAlarmApi;
import io.donbee.tmf.alarm.starter.service.CommentAlarmService;
import io.donbee.tmf.alarm.common.model.CommentAlarm;
import io.donbee.tmf.alarm.common.model.CommentAlarmFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentAlarmController implements CommentAlarmApi {

    private final CommentAlarmService service;

    @Override
    public ResponseEntity<CommentAlarm> createCommentAlarm(CommentAlarmFVO commentAlarmFVO, String fields) {
        return service.createCommentAlarm(commentAlarmFVO, fields);
    }

    @Override
    public ResponseEntity<List<CommentAlarm>> listCommentAlarm(String fields, Integer offset, Integer limit) {
        return service.listCommentAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<CommentAlarm> retrieveCommentAlarm(String id, String fields) {
        return service.retrieveCommentAlarm(id, fields);
    }
}
