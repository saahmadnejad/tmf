package io.donbee.tmf.alarm.app.service.impl;

import io.donbee.tmf.alarm.starter.service.HubService;
import io.donbee.tmf.alarm.common.model.Hub;
import io.donbee.tmf.alarm.common.model.HubFVO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HubServiceImpl implements HubService {

    @Override
    public ResponseEntity<Hub> createHub(HubFVO hubFVO) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Void> deleteHub(String id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public ResponseEntity<Hub> getHub(String id) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
