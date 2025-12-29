package factorization.api;

import java.io.IOException;

import factorization.shared.NetworkFactorization.MessageType;
import io.netty.buffer.ByteBuf;

public interface IEntityMessage {

    boolean handleMessageFromServer(MessageType messageType, ByteBuf input) throws IOException;

    boolean handleMessageFromClient(MessageType messageType, ByteBuf input) throws IOException;
}
