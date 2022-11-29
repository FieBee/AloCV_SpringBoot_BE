package com.example.alocv_be.service.job;

import com.example.alocv_be.model.*;
import com.example.alocv_be.repo.IJobRepo;
import com.example.alocv_be.service.job.JobService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.domain.Pageable;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class JobServiceTest {
    private IJobRepo jobRepo = Mockito.mock(IJobRepo.class);
    private JobService jobService = new JobService(jobRepo);

    @BeforeEach
    void init() {
        Job job = new Job();
        job.setId(1L);
        job.setName("job1");
        job.setHighlight("noibat");
        job.setSalaryRange(100L);
        job.setJobField(new JobField(1L,"IT",true));
        job.setLocation(new Location(1L,"Ha Noi",true));
        job.setCompany(new Company(1L,"company"));
        CV cv= new CV();
        cv.setId(1L);
        cv.setUser(new User(1L,"user"));


        List<Job> jobs = Arrays.asList(job);
        doReturn(Optional.of(job)).when(jobRepo).findById(1L);
        doReturn(jobs).when(jobRepo).findJobByCompanyId(1L);
        doReturn(jobs).when(jobRepo).findJobByJobFieldIdAndStatusIsTrue(1L);
        doReturn(jobs).when(jobRepo).findJobByUserId(1L);
        doReturn(jobs).when(jobRepo).findJobBy("job1",1L,1000L,"IT","Ha Noi","company");

        doReturn(jobs).when(jobRepo).findAll();
    }

    @Test
    @DisplayName("findAll can return list is not null")
    void whenFindAllNotNull() {
        assertThat(jobService.findAllJob()).isNotEmpty();
    }

    @Test
    @DisplayName("findbyID return job name job1")
    void whenFindById_thenReturnJob() {
        String name = "job1";
        Optional<Job> job = jobRepo.findById(1L);
        assertThat(job.get().getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("findbyID 2L return isPresent")
    public void whenFindById_thenReturnJobIsPresent() {
        Optional<Job> job = jobRepo.findById(2L);
        assertThat(job.isPresent()).isFalse();
    }

    @Test
    @DisplayName("save Job")
    void save() {
        Job job = new Job();
        job.setId(2L);
        job.setName("alo123");
        jobService.save(job);
        verify(jobRepo, times(1)).save(job);
    }

    @Test
    @DisplayName("find by field name, company, field, location, salary return list job")
    void findJob() {
        List<Job> jobList =  jobService.findJobBy("job1",1L,1000L,"IT","Ha Noi","company");
        String name = "job1";
        assertThat(jobList.get(0).getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("find by company Id return list job")
    void findJobByCompanyId() {
        List<Job> jobList =  jobService.findJobByCompanyId(1L);
        assertThat(jobList).isNotEmpty();
    }

    @Test
    @DisplayName("find by job field id return list job")
    void findJobByJobFieldId() {
        List<Job> jobList =  jobService.findJobByJobFieldId(1L);
        assertThat(jobList).isNotEmpty();
    }

    @Test
    @DisplayName("find by job User Id return list job")
    void findJobByUserId() {
        List<Job> jobList =  jobService.findJobByUserId(1L);
        assertThat(jobList).isNotEmpty();
    }
}
