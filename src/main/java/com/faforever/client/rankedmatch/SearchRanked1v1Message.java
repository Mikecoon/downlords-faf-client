package com.faforever.client.rankedmatch;

import com.faforever.client.game.Faction;
import com.faforever.client.game.GameType;
import com.faforever.client.legacy.domain.ClientMessageType;

public class SearchRanked1v1Message extends MatchMakerMessage {

  public Faction faction;
  private int gameport;

  public SearchRanked1v1Message(int gamePort, Faction faction) {
    super(ClientMessageType.GAME_MATCH_MAKING);
    mod = GameType.LADDER_1V1.getString();
    state = "start";
    this.faction = faction;
    setGameport(gamePort);
  }

  public Faction getFaction() {
    return faction;
  }

  public int getGameport() {
    return gameport;
  }

  public void setGameport(int gameport) {
    this.gameport = gameport;
  }
}
