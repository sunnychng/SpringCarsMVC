package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Vehicle;

@Repository
public interface CarRepository extends JpaRepository<Vehicle, Long> { }



