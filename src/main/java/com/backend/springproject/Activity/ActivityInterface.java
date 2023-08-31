package com.backend.springproject.Activity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityInterface extends JpaRepository <Activity, Long> {

}
