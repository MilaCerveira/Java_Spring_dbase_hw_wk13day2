package com.codeclan.example.FilesAndFoldersHw.controllers;

import com.codeclan.example.FilesAndFoldersHw.models.File;
import com.codeclan.example.FilesAndFoldersHw.models.Folder;
import com.codeclan.example.FilesAndFoldersHw.repositories.FileRepository;
import com.codeclan.example.FilesAndFoldersHw.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class FileController {
    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles() {
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/file/{id}")
    public ResponseEntity getFile(@PathVariable Long id) {
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/file")
    public ResponseEntity<File> postFile(@RequestBody File file) {
        fileRepository.save(file);
        return new ResponseEntity(file, HttpStatus.CREATED);
    }

}
