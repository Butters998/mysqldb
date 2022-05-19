package pl.faferek.mysqldb;

import java.util.List;

public interface VideoDao {
    void saveVideo(long id, String title, String url);

    List<Video> findAll();

    void updateVideo(Video newVideo);

    void deleteVideo();
}
