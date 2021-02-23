package com.codeclan.example.FilesAndFoldersHw.repositories;

import com.codeclan.example.FilesAndFoldersHw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
