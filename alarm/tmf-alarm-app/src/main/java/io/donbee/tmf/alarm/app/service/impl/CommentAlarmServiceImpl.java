package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.CommentAlarmService;
import io.donbee.tmf.alarm.common.model.CommentAlarm;
import io.donbee.tmf.alarm.common.model.CommentAlarmFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentAlarmServiceImpl implements CommentAlarmService {

    @Override
    public ResponseEntity<CommentAlarm> createCommentAlarm(CommentAlarmFVO commentAlarmFVO, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<List<CommentAlarm>> listCommentAlarm(String fields, Integer offset, Integer limit) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<CommentAlarm> retrieveCommentAlarm(String id, String fields) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
