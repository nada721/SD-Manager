package com.sdManager.SDManager.Controller;

import com.sdManager.SDManager.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @PostMapping("/{reportId}/assignee")
    public ResponseEntity<?> setAssignee(@PathVariable Long reportId, @RequestBody Long assigneeId) {
        reportService.setAssignee(reportId, assigneeId);
        return ResponseEntity.ok().build();
    }
}
