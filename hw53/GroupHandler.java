/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw53;

/**
 *
 * @author Администратор
 */
public class GroupHandler {

    private GroupBD groupBD;

    public GroupHandler(GroupBD groupBD) {
        super();
        this.groupBD = groupBD;
    }

    public GroupBD getGroupBD() {
        return groupBD;
    }

    public void setGroupBD(GroupBD groupBD) {
        this.groupBD = groupBD;
    }

    public Group loadGroupByName(String groupName) {
        if (groupBD == null) {
            throw new IllegalArgumentException("Базы Данных нет");
        }
        return groupBD.loadGroupByName(groupName);
    }

    public void groupSaver(Group group) {
        if (groupBD == null) {
            throw new IllegalArgumentException("Базы Данных нет");
        }
        groupBD.groupSaver(group);
    }
}
