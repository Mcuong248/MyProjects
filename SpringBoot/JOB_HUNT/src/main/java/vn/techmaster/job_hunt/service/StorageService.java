package vn.techmaster.job_hunt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import vn.techmaster.job_hunt.exception.StorageException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class StorageService {
    @Value("${upload.path}")
    private String path;
    // id của Employer id
    public String saveFile(MultipartFile file, String id) throws IOException {
        if (file.isEmpty()) {
            throw new StorageException("Failed to store empty file");
        }
        // logo.png
        String extension = getFileExtendsion(file.getOriginalFilename());
        String newFileName =path + id + "." + extension;
        // Lấy extension
        try {
            var is = file.getInputStream();
            Files.copy(is, Paths.get(path + id + "." + extension), StandardCopyOption.REPLACE_EXISTING);
            return id+"."+extension;
        } catch (IOException e) {
            var msg = String.format("Failed to store file %s", newFileName);
            throw new StorageException(msg, e);
        }
    }

    public void deleteFile(String logoPath){
        String filePathToDelete = path + logoPath;
        try {
            Files.deleteIfExists(Paths.get(filePathToDelete));
        } catch (IOException e) {
            var msg = String.format("Failed to delete  %s", filePathToDelete);
            throw new StorageException(msg, e);
        }
    }

    /*
    Bóc tách file extension từ file name
    Ex:
    input: pic1.png
    output: png
     */
    public String getFileExtendsion(String fileName){
        int postOfDot = fileName.lastIndexOf(".");
        if(postOfDot>=0){
            return fileName.substring(postOfDot+1);
        }else {
            return null;
        }
    }
}


