package com.codeclan.example.FilesAndFoldersHw.components;

import com.codeclan.example.FilesAndFoldersHw.models.Folder;
import com.codeclan.example.FilesAndFoldersHw.models.User;
import com.codeclan.example.FilesAndFoldersHw.repositories.FileRepository;
import com.codeclan.example.FilesAndFoldersHw.repositories.FolderRepository;
import com.codeclan.example.FilesAndFoldersHw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

         User mila = new User("Mila");
         userRepository.save(mila);

         User alex = new User("Alex");
         userRepository.save(alex);

         User bela = new User("Bela");
         userRepository.save(bela);

         Folder megadollars = new Folder("megadollars", mila);
         folderRepository.save(megadollars);

         Folder desperateHouseWives = new Folder("desperateHouseWives", alex);
         folderRepository.save(desperateHouseWives);

         Folder house = new Folder("house", bela);
         folderRepository.save(house);
    }

}
