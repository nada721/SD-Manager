package com.sdManager.SDManager.Service;

import com.sdManager.SDManager.Entity.Report;
import com.sdManager.SDManager.Entity.User;
import com.sdManager.SDManager.Repository.ReportRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private UserService userService;

    public void setAssignee(Long reportId, Long assigneeId) {
        Report report = reportRepository.findById(reportId)
                                        .orElseThrow(() -> new EntityNotFoundException("Report not found with id: " + reportId));

        User assignee = userService.getUserById(assigneeId);
        report.setAssignee(assignee);

        reportRepository.save(report);
    }
}
