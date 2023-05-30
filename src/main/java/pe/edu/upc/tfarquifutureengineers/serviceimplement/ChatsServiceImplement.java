package pe.edu.upc.tfarquifutureengineers.serviceimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tfarquifutureengineers.entities.Chats;
import pe.edu.upc.tfarquifutureengineers.repositories.IChatsRepository;
import pe.edu.upc.tfarquifutureengineers.services.IChatsService;

import java.util.List;

@Service
public class ChatsServiceImplement implements IChatsService {
    @Autowired
    private IChatsRepository cR;

    @Override
    public void insert(Chats chats) {
        cR.save(chats);


    }

    @Override
    public List<Chats> list() {
        return cR.findAll();
    }
}