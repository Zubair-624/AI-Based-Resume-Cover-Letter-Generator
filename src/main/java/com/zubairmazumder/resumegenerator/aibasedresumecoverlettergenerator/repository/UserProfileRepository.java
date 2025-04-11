package com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.repository;

import com.zubairmazumder.resumegenerator.aibasedresumecoverlettergenerator.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, String> {

    boolean exitByEmail(String email);
}
