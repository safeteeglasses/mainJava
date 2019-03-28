import TodoList from '@/components/TodoList';
/* eslint-disable-next-line no-unused-vars */
import { shallowMount, Wrapper } from '@vue/test-utils';

import chai from 'chai';
chai.should();

describe('TodoList', () => {

    /** @type Wrapper */
    let wrapper;

    beforeEach( () => {
        wrapper = shallowMount(TodoList);
    });

    it('should be a Vue instance', () => {
        wrapper.isVueInstance().should.be.true;
    });

    it('renders a single task list item to the unordered list', () => {
        const todos = [ {id: 1, task: "Drive to work", completed: false} ];
        wrapper.setData({todos});
        wrapper.find('.todo-list ul li').text().should.equal('Drive to work');
    });

    it('renders 3 todo list items to the DOM when our todos array contains 3 objects', () => {
        const todos = [
            { id: 1, task: 'Wake up', completed: false },
            { id: 2, task: '5 Minute Morning Movement', completed: false },
            { id: 3, task: 'Meditate', completed: false }
        ];
        wrapper.setData({todos});
        wrapper.findAll('li').length.should.equal(3);
    });

    it('clicking the list item should call our change status method and add the class completed',() => {
        const todos = [ {id: 1, task: "Drive to work", completed: false} ];
        wrapper.setData({todos});
        wrapper.find('.todo-list ul li').trigger('click')
        wrapper.find('.todo-list ul li').hasClass('todo-completed').should.be.true;
    });

});

