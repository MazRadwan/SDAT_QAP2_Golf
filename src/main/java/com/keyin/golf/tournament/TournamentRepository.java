package com.keyin.golf.tournament;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    List<Tournament> findByStartDate(LocalDate startDate);
  List<Tournament> findByLocation(String location);
//    List<Tournament> findByLocationContainingIgnoreCase(String location);
    List<Tournament> findByStartDateBetween(LocalDate startDate, LocalDate endDate);
}