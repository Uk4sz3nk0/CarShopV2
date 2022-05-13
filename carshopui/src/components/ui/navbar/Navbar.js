import React from "react";

class Navbar extends React.Component{

    render(){
        return (
                <nav class="flex items-center justify-between flex-wrap bg-gray-400 p-6">
                    <div class="flex items-center flex-shrink-0 text-white mr-6">
                        <span class=" text-xl tracking-tight text-red-600 font-bold">MOTOMOTO</span>
                    </div>
                    <div class="block w-64">
                    </div>
                    <div class="w-full place-items-end content-end block flex-grow lg:flex lg:items-end lg:w-auto mr-0">
                        <div>
                            <a href="#" class="inline-block text-sm px-4 py-2 leading-none border rounded text-white border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 lg:mt-0">Log in</a>
                            <a href="#" class="inline-block text-sm px-4 py-2 leading-none border rounded text-white bg-red-500 border-white hover:border-transparent hover:text-teal-500 hover:bg-white mt-4 ml-2 lg:mt-0">Sign in</a>
                        </div>
                </div>
            </nav>
        )
    }
}

export default Navbar;