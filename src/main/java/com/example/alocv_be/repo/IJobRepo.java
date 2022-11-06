package com.example.alocv_be.repo;

import com.example.alocv_be.model.Job;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends PagingAndSortingRepository<Job, Long> {

    @Query(value ="select * from job where\n" +
            "(SELECT e.* FROM job as e\n" +
            "INNER joiN job_field on e.job_field_id =job_field.id\n" +
            "INNER join location on e.location_id = location.id\n" +
            "WHERE e.name = :name AND e.salary_range = :salary_range AND job_field.name = :job_field_name  AND location.name = :location_name)\n" +
            "in (SELECT job.* FROM job\n" +
            "    join company_job_list jl\n" +
            "    join company c on jl.company_id = c.id\n" +
            "    where job.id = jl.job_list_id and c.name = :c_name);", nativeQuery = true)
    List<Job> findJobByNameAndSalaryRangeAndJobFieldAndLocation(@Param("name") String name,
                                                                    @Param("salary_range") Long salaryRange,
                                                                    @Param("job_field_name") String jobField,
                                                                    @Param("location_name") String location,
                                                                    @Param("c_name") String companyName);
//    @Query("SELECT e FROM Job e WHERE e.name = :name AND e.salaryRange = :salaryRange AND e.company.name = :company AND e.jobField.name = :jobField AND e.location.name = :location")
//    List<Job>findJobBy(@Param("name") String name, @Param("salaryRange") Long salaryRange, @Param("company") String company, @Param("jobField") String jobField, @Param("location") String location);

//    @Query(value ="select * from job where\n" +
//            "(SELECT e.* FROM job as e\n" +
//            "INNER joiN job_field on e.job_field_id =job_field.id\n" +
//            "INNER join location on e.location_id = location.id\n" +
//            "WHERE e.name = 'kysu' AND e.salary_range = 12 AND job_field.name = 'IT'  AND location.name = 'HaNoi')\n" +
//            "in (SELECT job.* FROM job\n" +
//            "    join company_job_list jl\n" +
//            "    join company c on jl.company_id = c.id\n" +
//            "    where job.id = jl.job_list_id and c.name = 'CodeGym');", nativeQuery = true)
//
//    List<Job> h();
}


