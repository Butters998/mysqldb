package pl.faferek.mysqldb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private VideoDao videoDao;

    @Autowired
    public Start(VideoDao videoDao) {
        this.videoDao = videoDao;
//        videoDao.saveVideo(2L, "java", "przemek.pl");
////        videoDao.saveVideo(3L, "python", "przemek2.pl");
////        videoDao.saveVideo(4L, "c++", "przemek3.pl");
//        videoDao.updateVideo(new Video(4L,"innyTemat", "innyURL"));
        videoDao.deleteVideo(2L);
        videoDao.findAll().forEach(System.out::println);

    }

}
