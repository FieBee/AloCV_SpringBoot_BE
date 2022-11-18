package com.example.alocv_be.repo;

import com.example.alocv_be.model.Job;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IJobRepo extends PagingAndSortingRepository<Job, Long> {
    @Query(value = "SELECT e.* FROM job as e\n" +
            "LEFT JOIN  job_field on  e.job_field_id =job_field.id\n" +
            "LEFT JOIN  location on e.location_id = location.id\n" +
            "LEFT JOIN  company on e.company_id = company.id\n" +
            "WHERE e.name like "+'%'+":name"+'%'  +
            " AND ( e.salary_range BETWEEN  "+":salary_range_min and :salary_range_max)" +
            " AND ( job_field.name like "+'%'+":job_field_name"+ "%)"+
            " AND ( location.name like "+'%'+":location_name"+"%)"+
            " AND  e.status = true"+
            " AND ( company.name like "+'%'+":company_name"+"%)", nativeQuery = true)
    List<Job> findJobBy(@Param("name") String name,
                        @Param("salary_range_min") Long salaryRange_min,
                        @Param("salary_range_max") Long salaryRange_max,
                        @Param("job_field_name") String jobField,
                        @Param("location_name") String location,
                        @Param("company_name") String company);


    @Query(value = "SELECT e.* FROM job as e\n" +
            "LEFT JOIN  cv on  e.id =cv.job_id\n" +
            "LEFT JOIN  user on  cv.user_id = user.id\n" +
            "WHERE user.id = :userId\n" +
            "And cv.status = true"
            , nativeQuery = true)
    List<Job> findJobByUserId(@Param("userId") Long userId);

    List<Job> findAllByStatusIsTrue();

    List<Job> findAll();

    List<Job> findJobByLocationId(Long id);
    List<Job> findJobByLocationIdAndStatusIsTrue(Long id);
    List<Job> findJobByCompanyIdAndStatusIsTrue(Long id);
    List<Job> findJobByCompanyId(Long id);
    List<Job> findJobByJobFieldId(Long id);
    List<Job> findJobByJobFieldIdAndStatusIsTrue(Long id);
    List<Job> findAllByIdAndStatus(Pageable pageable, Long id, boolean status);
    List<Job>findJobByUserIdAndStatusIsTrue(Long id);


//    Hiện job mới đăng gần nhất
    @Query(value = "select * from job j WHERE j.status = true order by j.created_at desc ", nativeQuery = true)
     List<Job> getNewDisplayJob();
}


