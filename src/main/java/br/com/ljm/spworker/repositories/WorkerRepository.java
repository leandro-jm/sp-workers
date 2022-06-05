package br.com.ljm.spworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ljm.spworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}