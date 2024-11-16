package Lesson15

abstract class ForumUsers
{
    abstract var login:String
    abstract var password:String
    abstract var moderation:Boolean

}

class User(
    override var login:String,
    override var password:String,
    override var moderation:Boolean= false,
): ForumUsers(),Talking


class Moderator(
    override var login:String,
    override var password:String,
    override var moderation:Boolean= true,
): ForumUsers(),Talking,Moderation